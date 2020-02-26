package com.example.demo.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * @author wjx
 * @Date:2019/1/17
 * @Description:
 */
@Data
@MappedSuperclass
public class AbstractDo {
    @Id
    private Integer id;
}
