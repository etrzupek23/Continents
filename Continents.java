/*
This program shows the largest city in a specific continent based on the continent selected
Created by Emma on Feb. 13th, 2020
Intermediate Programming - Block 8
*/
//defines the class
public class Continents {
	public static void main(String[] args) {
//defines the continent chosen
    int continent = 4;
//switch statement
    switch(continent){
//possible options for continents to choose (1-7)
	    case 1:
        System.out.println("North America: Mexico City, Mexico");
        break;
      case 2:
        System.out.println("South America: Sao Paulo, Brazil");
        break;
      case 3:
        System.out.println("Europe: Moscow, Russia");
        break;
      case 4:
        System.out.println("Africa: Lagos, Nigeria");
        break;
      case 5:
        System.out.println("Asia: Shanghai, China");
        break;
      case 6:
        System.out.println("Australia: Sydney, Australia");
        break;
      case 7:
        System.out.println("Antarctica: McMurdo Station, US");
        break;
//prints out when there isn't a valid continent chosen
      default:
        System.out.println("Undefined continent!");
    }
	}
}
