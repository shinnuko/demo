package com.example.demo.domain;

//バリテーション＝入力チェック

//最大数
import javax.validation.constraints.Max;
//最小数
import javax.validation.constraints.Min;
//空白
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class Item {
  private Long id;

  @NotBlank(message="名前を記入してください。")
  private String name;
  //18歳以上の年齢制限
  @Min(value=18, message="未成年は使用できません。18以上の数値を入力してください。")
  //過度な荒らし対策
  @Max(value=100, message="100以下の数値を入力してください。")
  private float age;
  //コメントは簡潔に求める
  @Size(max=50, message="コメントは50文字を超えないでください。")
  private String comment;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public float getPrice() {
    return age;
  }

  public void setPrice(float age) {
    this.age = age;
  }

  public String getVendor() {
    return comment;
  }

  public void setVendor(String comment) {
    this.comment = comment;
  }
}

