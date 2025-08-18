create table user (
                      id bigint auto_increment primary key not null comment 'ID',
                      name varchar(100) not null comment '用户名',
                      password varchar(100) not null comment '加密后密码',
                      create_time datetime comment '创建时间',
                      create_user varchar(100) comment '创建用户',
                      update_time datetime comment '更新时间',
                      update_user varchar(100) comment '更新用户'
) comment '用户信息表';
create index idx_user_name on user (name);

create table user_role (
                           id bigint auto_increment primary key not null comment 'ID',
                           user_id bigint not null comment '用户ID',
                           role_id bigint not null comment '角色ID',
                           create_time datetime comment '创建时间',
                           create_user varchar(100) comment '创建用户',
                           update_time datetime comment '更新时间',
                           update_user varchar(100) comment '更新用户'
) comment '用户角色表';
create index idx_user_role_id on user_role (user_id);

insert into user(name, password, create_time, create_user, update_time, update_user) values ('admin', '677789cf3e0a0f09910038345a989fdc', sysdate, 'system', sysdate, 'system');