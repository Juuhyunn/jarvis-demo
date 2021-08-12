//package shop.Jarvis.app.demo.calculator.controller;
//
//import lombok.RequiredArgsConstructor;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import shop.Jarvis.app.demo.calculator.entity.Item;
//import shop.Jarvis.app.demo.calculator.entity.User;
//import shop.Jarvis.app.demo.calculator.service.ItemService;
//
//import java.util.List;
//import java.util.Optional;
//
//@RestController @RequiredArgsConstructor @RequestMapping("/item")
//public class ItemController {
//    private final ItemService itemService;
//
//    @GetMapping("/all") public List<Item> findAll() {
//        return itemService.findAll();
//    }
//    @GetMapping("/name/{name}") public List<Item> findAllByName(@PathVariable String name) {
//        return itemService.findAllByItemName(name);
//    }
//    @GetMapping("/id/{id}") public Optional<Item> findById(@PathVariable long id) {
//        return itemService.findById(id);
//    }
//
//}
