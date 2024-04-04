class NotEligibleException extends Exception {
    public NotEligibleException(String message) {
        super(message);
    }
}

class CricketRating {
    private String playerName;
    private float critic1;
    private float critic2;
    private float critic3;
    private float avgRating;
    private String coins;

    public CricketRating(String playerName, float critic1, float critic2, float critic3) {
        this.playerName = playerName;
        this.critic1 = critic1;
        this.critic2 = critic2;
        this.critic3 = critic3;
        calculateAverageRating();
        calculateCoins();
    }

    public CricketRating(String string, double d) {
		// TODO Auto-generated constructor stub
	}

	private void calculateAverageRating() {
        avgRating = (critic1 + critic2 + critic3) / 3.0f;
    }

    private void calculateCoins() {
        if (avgRating >= 7) {
            coins = "Gold";
        } else if (avgRating >= 5) {
            coins = "Silver";
        } else if (avgRating >= 2) {
            coins = "Copper";
        } else {
            try {
                throw new NotEligibleException("\nPlayer not eligible for any coin.");
            } catch (NotEligibleException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public void display() {
        System.out.println(playerName + " " + String.format("%.2f", avgRating) + " " + coins);
    }
}

public class CricketPlayerRatings {
    public static void main(String[] args) {
        // Example input
    	CricketRating john = new CricketRating("John", 9.3f, 9.67f, 8.7f);
        john.display();
        CricketRating Henry = new CricketRating("Henry", 1.5f, 1.5f, 1.5f);
        Henry.display();
  
    }
}
