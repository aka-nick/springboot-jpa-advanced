package jpabook.jpashop;

import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MemberRepositoryTest {

//    @Autowired
//    MemberRepository memberRepository;
//
//    @Test
//    @Transactional
//    public void testMember() {
//        Member member = new Member();
//        member.setUsername("memberA");
//
//        Long id = memberRepository.save(member);
//
//        Member find = memberRepository.find(id);
//
//        assertThat(find.getUsername()).isEqualTo("memberA");
//        assertThat(find).isEqualTo(member); // 같은 영속성 컨텍스트 안에서는 동등성 보장
//    }
}