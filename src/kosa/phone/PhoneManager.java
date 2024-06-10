package kosa.phone;


import java.util.*;

public class PhoneManager {
    static int phoneCount = 0;
    static List<PhoneInfo> phoneList = new ArrayList<>();
    Scanner in = new Scanner(System.in);

    public void addPhoneInfo(String name, String phoneNo, String birth) {

        boolean flag = true;
        for (int i = 0; i < phoneCount; i++) {
            if (phoneList.get(i).phoneNo.equals(phoneNo)) {
                flag = false;
                break;
            }
        }

        if (flag) {
            if (10 <= phoneList.size()) {
                System.out.println("⚠️전화번호부가 가득 찼습니다 ⚠️");
                System.out.println();
            } else {
                phoneList.add(new PhoneInfo(name, phoneNo, birth));
                phoneCount++;
            }

        } else {
            System.out.println("⚠️중복된 번호의 전화번호부가 존재합니다 ⚠️");
            System.out.println();
        }
    }

    public void listPhoneInfo() {
        if (phoneList.size() > 0) {

            Iterator<PhoneInfo> iter = phoneList.iterator();

            while (iter.hasNext()) {
                iter.next().show();
            }
        } else {
            System.out.println("⚠️현재 전화번호부가 비어있습니다 ⚠️");
            System.out.println();
        }
    }

    public void searchPhoneInfo(String name) {
        boolean flag = false;
        int num = 0;
        for (int i = 0; i < phoneList.size(); i++) {

            if (phoneList.get(i).name.equals(name)) {
                flag = true;
                num = i;
                break;
            }
        }

        if (flag) {
            System.out.println(name + "님의 검색 결과");
            phoneList.get(num).show();
        } else {
            System.out.println("⚠️" + name + "라는 이름의 결과가 존재하지 않습니다 ⚠️");
            System.out.println();
        }
    }

    public void updatePhoneInfo(String name) {
        boolean flag = false;
        int num = 0;
        for (int i = 0; i < phoneList.size(); i++) {

            if (phoneList.get(i).name.equals(name)) {
                flag = true;
                num = i;
                break;
            }
        }

        if (flag) {
            System.out.println(name + "님의 검색 결과");
            phoneList.get(num).show();
            System.out.print("수정할 번호 입력 : ");
            String phone = in.nextLine();
            phoneList.get(num).phoneNo = phone;
        } else {
            System.out.println("⚠️" + name + "라는 이름의 결과가 존재하지 않습니다 ⚠️");
            System.out.println();
        }
    }

    public void deletePhoneInfo(String name) {
        boolean flag = false;
        int num = 0;
        for (int i = 0; i < phoneList.size(); i++) {

            if (phoneList.get(i).name.equals(name)) {
                flag = true;
                num = i;
                break;
            }
        }

        if (flag) {
            phoneList.remove(phoneList.get(num));
            System.out.println("삭제 되었습니다 !!");
        } else {
            System.out.println("⚠️" + name + "라는 이름의 결과가 존재하지 않습니다 ⚠️");
            System.out.println();
        }

    }

    public void sortPhoneInfo(int num) {
        // 이름
        if (num == 1) {
            Collections.sort(phoneList, (o1, o2) -> o1.getName().compareTo(o2.getName()));

            System.out.println("이름순으로 정렬하였습니다ㅣ!");
        }
        // 번호
        else if (num == 2) {

            Collections.sort(phoneList, (o1, o2) -> o1.getPhoneNo().compareTo(o2.getPhoneNo()));

            System.out.println("번호순으로 정렬하였습니다ㅣ!");
        }
        // 생일
        else if (num == 3) {

            Collections.sort(phoneList, (o1, o2) -> o1.getBirth().compareTo(o2.getBirth()));

            System.out.println("번호순으로 정렬하였습니다ㅣ!");
        }
        else {
            System.out.println("제대로 입력해주세욥");
        }
    }
}