package jpabook.jpashop.service;

import jpabook.jpashop.domain.item.Book;
import jpabook.jpashop.domain.item.Item;
import jpabook.jpashop.repository.ItemRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class ItemServiceTest {

  @Autowired ItemService itemService;
  @Autowired ItemRepository itemRepository;
  private EntityManager em;

  @Test
  public void saveItem() {
    //given
    Book book = new Book();
    book.setName("Shin");

    //when
    itemService.saveItem(book);

    //then
    assertEquals(book, itemRepository.findOne(book.getId()));
  }

  @Test
  public void findItems() {
    //given
    Book book1 = new Book();
    book1.setName("shin1");

    Book book2 = new Book();
    book2.setName("shin2");

    //when
    itemService.saveItem(book1);
    itemService.saveItem(book2);
    List<Item> itemResult = itemService.findItems();

    //then
    System.out.println("itemResult = " + itemResult);
    
  }

  @Test
  public void findOne() {
  }
}