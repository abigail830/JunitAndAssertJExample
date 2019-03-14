# JUNIT And AssertJ Example

## 背景介绍

示例代码取自 ThoughtWorks 内部报销系统，
1. 系统报销根据所得 ExpenseService.Project 的类型与名称判定产生何种类型的 ExpenseService.Expense
2. 在报销过程中，可能存在数据丢失或伪造的情况，所以需要判定 ExpenseService.Project 类型是不是无效的

###### *注：项目截取改编自 Salesforce/APEX*

## 测试代码

项目测试代码分别测试五种不同的情况
1. 内部项目
2. 外部项目 + 规范名称 A
3. 外部项目 + 规范名称 B
4. 外部项目 + 其他名称
5. 错误项目

通过使用 AssertJ，采用 Fluent API 的方式断言，更加清晰和直观的对需要判定的内容审查

## 技术栈
1. gradle
2. Java 8
3. JUnit 5
4. AssertJ 3.10.0

