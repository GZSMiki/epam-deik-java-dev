package com.epam.training.webshop.core.cart.grosspricecalculator;

import com.epam.training.webshop.core.cart.Cart;
import com.epam.training.webshop.core.finance.money.Money;

public interface GrossPriceCalculator {

  Money getAggregatedGrossPrice(Cart cart);

}
