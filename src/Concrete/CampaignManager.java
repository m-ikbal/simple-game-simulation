package Concrete;

import Entities.Campaign;
import interfaces.CampaignService;

public class CampaignManager implements CampaignService {
    @Override
    public void add(Campaign campaign) {
        System.out.println("Kampanya eklendi: " + campaign.getName());
    }

    @Override
    public void delete(Campaign campaign) {
        System.out.println("Kampanya silindi");
    }

    @Override
    public void update(Campaign campaign) {
        System.out.println("Kampanya güncellendi");
    }
}
