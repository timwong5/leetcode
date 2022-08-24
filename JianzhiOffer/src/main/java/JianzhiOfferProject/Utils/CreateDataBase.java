package JianzhiOfferProject.Utils;

/**
 * @author timwong5
 * @date 2022-08-22 10:39
 */
public class CreateDataBase {


    public static void main(String[] args) {
        String[] comments = {"ID",
                "日期",
                "公司/店名",
                "销售额（金额）",
                "销售额（占比）",
                "原材料（金额）",
                "原材料（占比）",
                "毛利率（金额）",
                "毛利率（占比）",
                "综合费用（金额）",
                "综合费用（占比）",
                "员工工资（金额）",
                "员工工资（占比）",
                "员工福利（金额）",
                "员工福利（占比）",
                "员工保险费（金额）",
                "员工保险费（占比）",
                "场地租金（金额）",
                "场地租金（占比）",
                "水电气费用（金额）",
                "水电气费用（占比）",
                "员工宿舍费用（金额）",
                "员工宿舍费用（占比）",
                "品牌管理费（金额）",
                "品牌管理费（占比）",
                "其他经营费用（金额）",
                "其他经营费用（占比）",
                "利润总额（金额）",
                "利润总额（占比）"


        };


        String[] name = {"PROFIT_SUMMARY_ID",
                "REPORT_DATE",
                "STORE_NAME",
                "SALES_VALUE",
                "SALES_PERCENT",
                "MATERIAL_VALUE",
                "MATERIAL_PERCENT",
                "PROFIT_RATE_VALUE",
                "PROFIT_RATE_PERCENT",
                "COST_VALUE",
                "COST_PERCENT",
                "SALARY_VALUE",
                "SALARY_PERCENT",
                "WELFARE_VALUE",
                "WELFARE_PERCENT",
                "INSURANCE_EXPENSES_VALUE",
                "INSURANCE_EXPENSES_PERCENT",
                "RENT_VALUE",
                "RENT_PERCENT",
                "WATER_ELECTRIC_GAS_VALUE",
                "WATER_ELECTRIC_GAS_PERCENT",
                "DORMITORY_VALUE",
                "DORMITORY_PERCENT",
                "BRAND_VALUE",
                "BRAND_PERCENT",
                "OTHER_MANAGE _VALUE",
                "SALES_PERCENT",
                "PROFIT_TOTAL_VALUE",
                "PROFIT_TOTAL_PERCENT"
        };
//        String[] style = new String[150];


        for (int i = 0; i < name.length; i++) {
            String sql = name[i] + " float(100,2)" + " null comment" + " " + "'" + comments[i] + "'" + ",";
            System.out.println(sql);
        }


    }
}
