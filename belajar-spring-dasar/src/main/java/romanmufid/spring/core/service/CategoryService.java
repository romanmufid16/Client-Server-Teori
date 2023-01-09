package romanmufid.spring.core.service;

import lombok.Getter;
import romanmufid.spring.core.repository.CategoryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class CategoryService {

  @Getter
  private CategoryRepository categoryRepository;

  @Autowired
  public void setCategoryRepository(CategoryRepository categoryRepository) {
    this.categoryRepository = categoryRepository;
  }
}
