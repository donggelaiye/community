##码匠社区

##资料
[Spring 文档](https://spring.io/guides)

[Spring Web](https://spring.io/guides/gs/serving-web-content/)

[社区](https://elasticsearch.cn/explore)

[github deploy key](https://github.com/donggelaiye/community/settings/keys)

[Bootstrap 文档](https://www.bootcss.com/)

[注册github APP Creating an OAuth App](https://developer.github.com/apps/building-oauth-apps/creating-an-oauth-app/) 

[thymeleaf资料](https://www.thymeleaf.org/doc/tutorials/3.0/usingthymeleaf.html#reformatting-dates-in-our-home-page)

[网页自动部署刷新插件](http://livereload.com/extensions/)
##工具
 [git](https://github.com/donggelaiye/community)
 
 [VP](https://www.visual-paradigm.com)
 
 ##脚本
```sql
create table user
(
    id           int auto_increment
        primary key,
    account_id   varchar(100) null,
    name         varchar(50)  null,
    token        char(36)     null,
    gmt_create   bigint       null,
    gmt_modified bigint       null
);

```