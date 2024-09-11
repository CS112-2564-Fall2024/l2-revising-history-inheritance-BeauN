/**
 * Main.java - Driver class to demonstrate revised historical examples
 * 
 * @author ???
 * @version ???
 */

public class Main {
	public static void main(String[] args) {
		String tulsaDescription = "A black teenager, who was working as a shoe shiner in downtown Tulsa, Oklahoma, was arrested and accused of assaulting a white woman on a public elevator in broad daylight. A group of white vigilantes, intent on lynching him, and armed black men intent on protecting him gathered at the courthouse. A shot rang out, and the violence began. The riot resulted in 35 square blocks of destruction, including more than 1,250 homes, churches, schools, businesses, a hospital, and a library.";
		Date tulsaDay = new Date(5, 31, 1921);
		HistoricalEvent tulsaRiot = new HistoricalEvent(tulsaDescription, tulsaDay);

		/**System.out.println("====================================================");
		System.out.println("HISTORICAL EVENT EXAMPLE:");
		System.out.println("====================================================");**/
		tulsaRiot.teach();
		//System.out.println(tulsaRiot);
		
		
		String tulsaRevised = "It started with newspaper reports that a black man had assaulted a white elevator operator. He was arrested, and black World War I vets rushed to the courthouse to prevent a lynching. Whites were deputized and handed weapons, the shooting started and then it got out of hand. It was mob rule for two days, and the result was the complete devastation of the entire black community. The white mobs looted the homes and businesses before they set fire to the community. Planes circled mid-air and bombed what was known as Black Wall Street. The National Guard was called out after the governor declared martial law, and imprisoned all blacks that were not already in jail. More than 35 blocks were destroyed, along with more than 1,200 homes, and some 300 people died, mostly Blacks.",
			tulsaCitation = "https://www.smithsonianmag.com/smithsonian-institution/long-lost-manuscript-contains-searing-eyewitness-account-tulsa-race-massacre-1921-180959251/";
		RevisedHistoricalEvent tulsaMassacre = new RevisedHistoricalEvent(tulsaDescription, tulsaDay,tulsaRevised, tulsaCitation);
		tulsaMassacre.teach();
		System.out.println("\n \n\n\n\n\n\n\n\n");
		String coolDescription = "Today i had a nice walk";
		Date coolDate = new Date(5, 20, 2025);
		//String coolRevised = "\n\nGood news. Despite being a car, I was accepted as a bee by beekind. I will soon demolish every single best buy in america";
		//String coolCitation = " Citation: yep this is true";
		HistoricalEvent coolEvent = new HistoricalEvent(coolDescription, coolDate /**coolRevised,
																					coolCitation*/
		);
		String coolDescription2 = "Today I had a bad walk";
		Date coolDate2 = new Date(6, 22, 2026);
		String coolDescription3 = "I wasn't born quite yet";
		Date coolDate3 = new Date(2, 10, 1548);
		//coolEvent.teach();
		HistoricalEvent coolEvent2 = new HistoricalEvent(coolDescription2, coolDate2);
		HistoricalEvent coolEvent3 = new HistoricalEvent(coolDescription3, coolDate3);
		//bubblesort!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		//https://www.youtube.com/watch?v=GQvl0zCb3Z0&pp=ygUTbW90aHJvY2sgYnVnIGZhYmxlcw%3D%3D
		HistoricalEvent[] array = {coolEvent, coolEvent3, coolEvent2 };
		HistoricalEvent temp = new HistoricalEvent();
		for (int j = 0; j < array.length; j++) {
			for (int i = 0; i < array.length -1; i++) {
				if (array[i].compareTo(array[i + 1]) > 0) {
					temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
				}

			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(" " + array[i]);
		}
	}
}