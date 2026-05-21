package repaso1;

public class Algorithm2 {
public static void main(String[] args) {
	boolean stop = false;
	String color = "green";
	if (color == "green") {
		stop = false; 

	}
	String semaphoreState = "w34";
	crossStreet(semaphoreState );
	crossStreet("green");
	crossStreet("yellow");
	crossStreet("red");
	crossStreet("rte45");
	System.out.println(stop);
}

private static void crossStreet(String semaphoreState) {
if (semaphoreState == "green") {
	System.out.println("crossing the street......");
}
	else if (semaphoreState == "yellow" || semaphoreState =="red") {
		System.out.println("wait for green .....");
	}
	else if (semaphoreState == "black") {
		System.out.println("contanting with trafic office .....");
	}
	else {
		System.out.println(" unknown inpunts,abandon the task.....");
	}
}
}
