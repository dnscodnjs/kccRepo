package kosa.phone;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;
import java.util.stream.Collectors;

public class PhoneManager {
    static int phoneCount = 0;
    static List<PhoneInfo> phoneList = new ArrayList<>();
    Scanner in = new Scanner(System.in);

    public void addPhoneInfo(PhoneInfo info) {
        // 번호가 존재하는지 중복 체크
        boolean flag = phoneList.stream().noneMatch(phone -> phone.getPhoneNo().equals(info.getPhoneNo()));

        if (flag) {
            if (phoneList.size() >= 10) {
                System.out.println("⚠️전화번호부가 가득 찼습니다 ⚠️");
                System.out.println();
            } else {
                phoneList.add(info);
                phoneCount++;
            }
        } else {
            System.out.println("⚠️중복된 번호의 전화번호부가 존재합니다 ⚠️");
            System.out.println();
        }
    }

    public void listPhoneInfo() {
        if (phoneList.size() > 0) {
            phoneList.forEach(PhoneInfo::show);
        } else {
            System.out.println("⚠️현재 전화번호부가 비어있습니다 ⚠️");
            System.out.println();
        }
    }

    public void searchPhoneInfo(String name) {

        //phoneList 리스트에서 이름이 주어진 이름과 일치하는 첫 번째 PhoneInfo 객체를 찾는 것
        Optional<PhoneInfo> result = phoneList.stream().filter(info -> info.getName().equals(name)).findFirst();

        if (result.isPresent()) {
            System.out.println(name + "님의 검색 결과");
            result.get().show();
        } else {
            System.out.println("⚠️" + name + "라는 이름의 결과가 존재하지 않습니다 ⚠️");
            System.out.println();
        }
    }

    public void updatePhoneInfo(String name) {

        Optional<PhoneInfo> result = phoneList.stream().filter(info -> info.getName().equals(name)).findFirst();

        if (result.isPresent()) {
            System.out.println(name + "님의 검색 결과");
            result.get().show();
            System.out.print("수정할 번호 입력 : ");
            String phone = in.nextLine();
            result.get().setPhoneNo(phone);
        } else {
            System.out.println("⚠️" + name + "라는 이름의 결과가 존재하지 않습니다 ⚠️");
            System.out.println();
        }
    }

    public void deletePhoneInfo(String name) {

        // phoneList 리스트에서 주어진 이름과 일치하는 모든 PhoneInfo 객체를 제거하는 것
        boolean removed = phoneList.removeIf(info -> info.getName().equals(name));

        if (removed) {
            System.out.println("삭제 되었습니다 !!");
        } else {
            System.out.println("⚠️" + name + "라는 이름의 결과가 존재하지 않습니다 ⚠️");
            System.out.println();
        }
    }

    public void sortPhoneInfo(int num) {
        if (num == 1) {
            phoneList.sort(Comparator.comparing(PhoneInfo::getName));
            System.out.println("이름순으로 정렬하였습니다!");
        } else if (num == 2) {
            phoneList.sort(Comparator.comparing(PhoneInfo::getPhoneNo));
            System.out.println("번호순으로 정렬하였습니다!");
        } else if (num == 3) {
            phoneList.sort(Comparator.comparing(PhoneInfo::getBirth));
            System.out.println("생일순으로 정렬하였습니다!");
        } else {
            System.out.println("제대로 입력해주세요");
        }
    }

    public void outputFile() {
        ObjectOutputStream oos = null;

        try {
            oos = new ObjectOutputStream(new FileOutputStream("phoneList.txt"));
            // List가 Serializable을 구현했기 떄문에 사용 가능한 것!
            oos.writeObject(phoneList);
            System.out.println("phoneList.txt 파일에 입력되었습니다!");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                oos.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void inputFile() {
        ObjectInputStream ois = null;
        List<PhoneInfo> inputList;
        try {
            inputList = new ArrayList<>();
            ois = new ObjectInputStream(new FileInputStream("phoneList.txt"));

            inputList = (List<PhoneInfo>) ois.readObject();

            for (PhoneInfo list : inputList) {
                list.show();
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                ois.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
