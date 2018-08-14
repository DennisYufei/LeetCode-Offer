package offer;

/**
 * 面试题3：二维数组中的查找
 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。 
 * 输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。 
 * @auther Dennis
 * @date 2017/12/15
 * 
 * 思想：假设需要查找的数字为x，首先选取数组中右上角的数字。如果该数字等于x，查找过程结束;
 * 如果该数字大于x，剔除这个数字所在的列;如果该数字小于x，剔除这个数字所在的行。 
 * 这样每一步都可以缩小查找的范围，直到找到要查找的数字，或者查找范围为空。 
 */
public class Problem3FindNumFromTwoDimensionalArray {
	
	public static boolean find(int[][] nums, int target) {
//		judge array is null or not 
		if(nums == null  ||  nums.length == 0  ||  ( nums.length == 1 && nums[0].length == 0 ) ) {
			System.out.println("array error");
			return false;
		}
		
//		define array’s row and colomn
		int rows = nums.length;	
		int cols = nums[1].length;
		
//		define origin row and colomn
		int row = 0;
		int col = cols-1;
		
//		judge row and colomn
		while(row >= 0 && row < rows && col >= 0 && col < cols) {
			if(nums[row][col] == target) {
				System.out.println("nums["+row+"]["+col+"]"+":"+nums[row][col]);
				return true;
			}
			else if(nums[row][col] > target) {
				col-- ;
			}
			else{
				row++ ;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		int [][] nums = {
						{1, 2, 8, 9},  
                		{2, 4, 9, 12},  
                		{4, 7, 10, 13},  
                		{6, 8, 11, 15}  
                		};
		int [][] nums1 = new int[][]{};
		int target = 7;
		System.out.println(find(nums1, target));
	}
}
