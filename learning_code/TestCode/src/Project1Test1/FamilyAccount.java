package Project1Test1;

/**
 * @ClassName FamilyAccount
 * @Description TODO
 * @Author 15588
 * @Date 2021/3/27 19:32
 * @Version 1.0
 */
public class FamilyAccount {

    public static void main(String[] args) {

        boolean loopFlag = true;
        String details = "��֧\t�˻����\t��֧���\t˵ ��\n";
        //��ʼ���
        int balance = 10000;
        int money;
        String info;
        details += "����\t" + balance + "\t" + "" + "\t" + "" + "\n";

        do {
            System.out.println("-----------------��ͥ��֧�������-----------------");
            System.out.println("                 1 ��֧��ϸ                 ");
            System.out.println("                 2 �Ǽ�����                 ");
            System.out.println("                 3 �Ǽ�֧��                 ");
            System.out.println("                 4 �� ��                 ");
            System.out.print("                 ��ѡ��(1-4)��                 ");

            char selection = Utility.readMenuSelection();
            switch (selection) {
                case '1':
                    System.out.println("-----------------��ǰ��֧��ϸ��¼-----------------");
                    System.out.println(details);
                    System.out.println("-----------------------------------------------");
                    break;
                case '2':
                    System.out.print("���������");
                    money = Utility.readNumber();
                    System.out.print("��������˵����");
                    info = Utility.readString();
                    balance += money;
                    details += "����\t" + balance + "\t" + money + "\t" + info + "\n";
                    System.out.println("-----------------�Ǽ����-----------------");
                    break;
                case '3':
                    System.out.print("����֧����");
                    money = Utility.readNumber();
                    System.out.print("����֧��˵����");
                    info = Utility.readString();
                    if (balance  < money){
                        System.out.print("���㣬�޷�֧����");
                        break;
                    }
                    balance -= money;
                    details += "֧��\t" + balance + "\t" + money + "\t" + info + "\n";
                    System.out.println("-----------------�Ǽ����-----------------");
                    break;
                case '4':
                    System.out.print("ȷ���Ƿ��˳�(Y/N):");
                    char isExit = Utility.readConfirmSelsction();
                    if (isExit == 'Y') {
                        loopFlag = false;
                    }
//                    break;
            }
        } while (loopFlag);

    }


}


