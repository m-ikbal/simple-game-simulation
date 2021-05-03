package Concrete;

import Entities.Member;
import Entities.Player;
import interfaces.MemberService;

public class MemberManager implements MemberService {
    @Override
    public void add(Member member) {
        System.out.println("Yeni üye eklendi: " + member.getFirstName());
    }

    @Override
    public void delete(Member member) {
        System.out.println("Üye silindi: " + member.getFirstName());
    }
}
