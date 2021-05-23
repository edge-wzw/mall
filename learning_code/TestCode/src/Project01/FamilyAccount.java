package Project01;

/**
 * @author Edge
 * @create 2021-02-16-12:25
 */
public class FamilyAccount {

    public static void main(String[] args) {
        boolean isFlag = true;
        //用于记录用户的收入和支出的详情
        String details = "收支\t账户金额\t收支金额\t说     明\n";
        //初始金额
        int balance = 10000;

        while (isFlag) {
            System.out.println("----------家庭收支记账软件----------");
            System.out.println("          1 收支明细");
            System.out.println("          2 登记收入");
            System.out.println("          3 登记支出");
            System.out.println("          4 退   出\n");
            System.out.print("          请选择(1-4):");
            //获取用户的选择：1-4
            char selection = Utility.readMenuSelection();
            switch (selection){
                case '1':
                    //System.out.println("1.收支明细");
                    System.out.println();
            }

        }
    }
}
