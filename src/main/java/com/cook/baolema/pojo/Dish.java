package com.cook.baolema.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import java.util.Date;

/**
 * @author 徐亮
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Setter
@Getter
public class Dish {
    private Integer dishID;
    private String dish;
    private Integer categoryID;
    private String dishPhoto;
    private String description;
    private float price;
    private Integer Inventory;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:SS")
    private Date createdTime;
}