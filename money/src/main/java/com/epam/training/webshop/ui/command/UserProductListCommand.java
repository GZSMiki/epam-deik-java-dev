package com.epam.training.webshop.ui.command;

import com.epam.training.webshop.core.product.ProductService;

public class UserProductListCommand extends AbstractCommand {
  private final ProductService productService;

  public UserProductListCommand(ProductService productService) {
    super("user", "product", "list");
    this.productService = productService;
  }

  @Override
  protected String process(String[] commandParts) {
    return productService.getAllProducts().toString();
  }
}
