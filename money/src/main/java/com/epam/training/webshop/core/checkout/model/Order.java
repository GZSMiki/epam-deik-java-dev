package com.epam.training.webshop.core.checkout.model;

import com.epam.training.webshop.core.finance.money.Money;
import com.epam.training.webshop.core.product.model.Product;
import java.util.Map;

public record Order(Map<Product, Integer> products, Money netPrice, Money grossPrice) {

}
