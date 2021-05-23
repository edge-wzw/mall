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
        String details = "收支\t账户金额\t收支金额\t说 明\n";
        //初始金额
        int balance = 10000;
        int money;
        String info;
        details += "收入\t" + balance + "\t" + "" + "\t" + "" + "\n";

        do {
            System.out.println("-----------------家庭收支记账软件-----------------");
            System.out.println("                 1 收支明细                 ");
            System.out.println("                 2 登记收入                 ");
            System.out.println("                 3 登记支出                 ");
            System.out.println("                 4 退 出                 ");
            System.out.print("                 请选择(1-4)：                 ");

            char selection = Utility.readMenuSelection();
            switch (selection) {
                case '1':
                    System.out.println("-----------------当前收支明细记录-----------------");
                    System.out.println(details);
                    System.out.println("-----------------------------------------------");
                    break;
                case '2':
                    System.out.print("本次收入金额：");
                    money = Utility.readNumber();
                    System.out.print("本次收入说明：");
                    info = Utility.readString();
                    balance += money;
                    details += "收入\t" + balance + "\t" + money + "\t" + info + "\n";
                    System.out.println("-----------------登记完成-----------------");
                    break;
                case '3':
                    System.out.print("本次支出金额：");
                    money = Utility.readNumber();
                    System.out.print("本次支出说明：");
                    info = Utility.readString();
                    if (balance  < money){
                        System.out.print("余额不足，无法支出！");
                        break;
                    }
                    balance -= money;
                    details += "支出\t" + balance + "\t" + money + "\t" + info + "\n";
                    System.out.println("-----------------登记完成-----------------");
                    break;
                case '4':
                    System.out.print("确认是否退出(Y/N):");
                    char isExit = Utility.readConfirmSelsction();
                    if (isExit == 'Y') {
                        loopFlag = false;
                    }
//                    break;
            }
        } while (loopFlag);

    }


}


