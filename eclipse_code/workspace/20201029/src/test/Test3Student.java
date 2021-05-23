package test;
/*
 * 
4. 对象数组题目：
定义类Student，包含三个属性：学号number(int)，年级state(int)，成绩
score(int)。 创建20个学生对象，学号为1到20，年级和成绩都由随机数确定。
问题一：打印出3年级(state值为3）的学生信息。
问题二：使用冒泡排序按学生成绩排序，并遍历所有学生信息
提示：
1) 生成随机数：Math.random()，返回值类型double; 
2) 四舍五入取整：Math.round(double d)，返回值类型long。
 */

public class Test3Student {
	public static void main(String[] args) {
		
		Student[] arr = new Student [20];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new Student();
			arr[i].number = (int)Math.round(Math.random() * 99 + 1);
			arr[i].state = (int)Math.round(Math.random() * 9 + 1);
			arr[i].score = (int)Math.round(Math.random() * 99 + 1);
		}
		
		//遍历查看
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println("学号为：" + arr[i].number + ", 年级为：" + arr[i].state + ",成绩为：" + arr[i].score);
//		}
//		
//		System.out.println("*********************");
		//问题一
//		boolean b1 = true;
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i].state == 3) {
//				System.out.println("学号为：" + arr[i].number + ", 年级为：" + arr[i].state + ",成绩为：" + arr[i].score);
//				b1 = false;
//			}
//		}
//		if(b1){
//			System.out.print("未找到满足条件的学生");
//		}
//		
		// 问题2
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j].score > arr[j + 1].score) {
					Student temp = new Student();
					temp = arr[j];
					arr[j] = arr[j +1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.println("*********************");
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("学号为：" + arr[i].number + ", 年级为：" + arr[i].state + ",成绩为：" + arr[i].score);
		}
		
		System.out.println("*********************");
		
	}
		
}

class Student{
	int number;
	int state;
	int score;
	
	
}