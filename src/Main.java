import Adapters.EDevletCheckLogger;
import Concrete.*;
import Entities.*;

public class Main {

    public static void main(String[] args) {

        PlayerManager playerManager = new PlayerManager();

        Player player = new Player();
        player.setId(1);
        player.setFirstName("anonymous");
        player.setLastName("anonymous");
        player.setUserName("anonymous");
        player.setPassword(12345);
        player.setEmail("anonymous@gmail.com");
        playerManager.save(player);

        MemberManager memberManager = new MemberManager();
        Member member = new Member();
        member.setFirstName("anonymous");
        memberManager.add(member);

        CustomerManager customerManager = new CustomerManager();
        Customer customer = new Customer(1, "anonymous", "anonymous", "anonymous", 12345, "anonymous@gmail.com");
        customerManager.save(customer);

        EDevletCheckLogger logger = new EDevletCheckLogger();
        logger.joinControl(customer);

        GameManager gameManager = new GameManager();
        Game game = new Game(1, "Java", 1234, 6);
        gameManager.salesGame(game);
        gameManager.salesPlayer(player);

        CampaignManager campaignManager = new CampaignManager();
        Campaign campaign = new Campaign();
        campaign.setDiscount(234234234);
        campaign.setName("Bahar indirimi!");
        campaign.getProductDiscount();
        campaignManager.add(campaign);

    }
}
