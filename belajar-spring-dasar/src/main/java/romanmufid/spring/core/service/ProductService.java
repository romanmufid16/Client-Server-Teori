package romanmufid.spring.core.service;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import romanmufid.spring.core.repository.ProductRepository;

// @Scope("prototype")
// @Lazy
@Component
public class ProductService {

  @Getter
  private ProductRepository productRepository;

  @Autowired
  public ProductService(ProductRepository productRepository){
    this.productRepository = productRepository;
  }

  public ProductService(ProductRepository productRepository, String name){
    this.productRepository = productRepository;
  }

}
