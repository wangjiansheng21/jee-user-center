package org.jee.boot.user.provider.config.mybatis;

import com.baomidou.mybatisplus.core.parser.ISqlParser;
import com.baomidou.mybatisplus.core.parser.ISqlParserFilter;
import com.baomidou.mybatisplus.core.toolkit.PluginUtils;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.extension.plugins.tenant.TenantHandler;
import com.baomidou.mybatisplus.extension.plugins.tenant.TenantSqlParser;
import net.sf.jsqlparser.expression.Expression;
import net.sf.jsqlparser.expression.LongValue;
import net.sf.jsqlparser.expression.operators.relational.ExpressionList;
import net.sf.jsqlparser.expression.operators.relational.InExpression;
import net.sf.jsqlparser.schema.Column;
import org.apache.ibatis.reflection.MetaObject;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * 单数据源配置（jeecg.datasource.open = false时生效）
 * @Author zhoujf
 *
 */
@Configuration
@MapperScan(value={"org.jee.user.mapper"})
public class MybatisPlusConfig {

    /**
     * tenant_id 字段名
     */
    public static final String tenant_field = "tenant_id";

    /**
     * 有哪些表需要做多租户 这些表需要添加一个字段 ，字段名和tenant_field对应的值一样
     */
    private static final List<String> tenantTable = new ArrayList<String>();
    /**
     * ddl 关键字 判断不走多租户的sql过滤
     */
    private static final List<String> DDL_KEYWORD = new ArrayList<String>();
    static {
        tenantTable.add("jee_bug_danbiao");
        DDL_KEYWORD.add("alter");
    }



//    /**
//     * mybatis-plus SQL执行效率插件【生产环境可以关闭】
//     */
//    @Bean
//    public PerformanceInterceptor performanceInterceptor() {
//        return new PerformanceInterceptor();
//    }

}
