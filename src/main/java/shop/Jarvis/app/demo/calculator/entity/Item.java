//package shop.Jarvis.app.demo.calculator.entity;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import org.springframework.data.annotation.Id;
//import org.springframework.data.mongodb.core.mapping.Document;
//
//import java.util.Date;
//
//@Document(collection = "items")
//@AllArgsConstructor
//@NoArgsConstructor
//@Data
//public class Item {
//    private String itemName;
//    private int price;
//    @Id private long itemId;
//    private String description;
//    private Date regDate;
//
//    @Override
//    public String toString() {
//        return "아이템 명세{" +
//                " 품명 : '" + itemName + '\'' +
//                " 가격 : " + price +
//                " 품번 : " + itemId +
//                " 상세 : " + description + '\'' +
//                " 등록 일자 : " + regDate +
//                '}';
//    }
//}
