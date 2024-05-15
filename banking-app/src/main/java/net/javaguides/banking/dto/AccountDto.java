package net.javaguides.banking.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

//@Data
// Dto 数据传输对象， 可以只选择需要的数据传递给控制层(controller)
//@AllArgsConstructor
//public class AccountDto {
//    private Long id;
//    private String accountHolderName;
//    private double balance;
//}

public record AccountDto(Long id, String accountHolderName, double balance) {
}
