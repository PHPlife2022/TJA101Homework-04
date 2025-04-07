package Homework4;

public class Homework4_1_3_aeiou {
	public static void main(String[] args) {
		String[] planet = {"mercury", "venus", "earth", "mars", 
				"jupiter", "saturn", "uranus", "neptune"};
		String[] aM ={"a","e","i","o","u"};
//		String[] a = planet[0].split("");
//		System.out.println(Arrays.toString(a));			
		int sum = 0;
		int count = 0;
		for(int r=0;r<planet.length;r++){
			count = 0;			
			String[] a= planet[r].split("");
			for(int i=0;i<aM.length;i++) {		
//				System.out.println();				
				for(int e=0;e<a.length;e++) {					
					int re = aM[i].compareTo(a[e]);					
					if(re == 0) {					
						count ++;						
					}					
				}				
			}			
			sum += count;
//			System.out.println();
		}		
		System.out.println("母音數量為:"+sum);
	}
}
