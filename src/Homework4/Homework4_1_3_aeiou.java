package Homework4;

public class Homework4_1_3_aeiou {
	public static void main(String[] args) {
		String[] planet = {"mercury", "venus", "earth", "mars", 
				"jupiter", "saturn", "uranus", "neptune"};
		String[] aM ={"a","e","i","o","u"};
//		String[] a = planet[0].split("");
//		System.out.println(Arrays.toString(a));		
		int r;
		int i;
		int e;
		int sum = 0;
		int count = 0;
		for(r=0;r<=planet.length -1;r++){
			count = 0;			
			String[] a= planet[r].split("");
			for(i=0;i<=aM.length-1;i++) {		
//				System.out.println();				
				for(e=0;e<=a.length-1;e++) {					
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
