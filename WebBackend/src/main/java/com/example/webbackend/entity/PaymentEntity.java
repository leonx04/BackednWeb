package com.example.webbackend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;
/**
 * @author dungn
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "payment", schema = "dbo", catalog = "ShopPoloWeb")
public class PaymentEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic
    @Column(name = "payment_date", nullable = true)
    private Date paymentDate;
    @Basic
    @Column(name = "payment_method", nullable = true, length = 255)
    private String paymentMethod;
    @Basic
    @Column(name = "amount", nullable = true, precision = 0)
    private Integer amount;
    @ManyToOne
    @JoinColumn(name = "order_id", referencedColumnName = "id")
    private OrderEntity orderByOrderId;

}
