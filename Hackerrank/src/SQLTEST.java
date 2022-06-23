
public class SQLTEST {

	public static void main(String args[]) {
		String sql2 ="\n" +
				"select\n" +
				"    ORGANIZATIONID,\n" +
				"    '' USERID,\n" +
				"    TEMPLATENAME,\n" +
				"    TEMPLATEID\n" +
				"from\n" +
				"    identitydb.TEMPLATE tmpl\n" +
				"        join (\n" +
				"        select\n" +
				"            dbms_lob.substr(\n" +
				"                    ATTRIBUTE_VALUE,\n" +
				"                    36,\n" +
				"                    dbms_lob.instr(\n" +
				"                            ATTRIBUTE_VALUE, 'callingBehaviorTemplate\":\"'\n" +
				"                        ) + length('callingBehaviorTemplate\":\"')\n" +
				"                ) Temaplate_Id,\n" +
				"            ENTITY_ID\n" +
				"        from\n" +
				"            identitydb.ORG_LARGE_ATTR\n" +
				"        where\n" +
				"                instr(\n" +
				"                        ATTRIBUTE_VALUE, 'callingBehaviorTemplate'\n" +
				"                    ) > 1\n" +
				"    ) tmpldata on TEMPLATEID = Temaplate_Id\n" +
				"        and ORGANIZATIONID = ENTITY_ID\n" +
				"        and TEMPLATETYPE = 'jabber'";
		
		String SQL3 = "\" select\\n\" +\r\n" + 
				"				\"    Finaluserdata.ORGANIZATIONID,\\n\" +\r\n" + 
				"				\"  Finaluserdata.USERID,\\n\" +\r\n" + 
				"				\"  tl.TEMPLATENAME,\\n\" +\r\n" + 
				"				\"  tl.TEMPLATEID\\n\" +\r\n" + 
				"				\"from\\n\" +\r\n" + 
				"				\"    identitydb.TEMPLATE tl\\n\" +\r\n" + 
				"				\"    JOIN (\\n\" +\r\n" + 
				"				\"    select\\n\" +\r\n" + 
				"				\"    us.ORGANIZATIONID,\\n\" +\r\n" + 
				"				\"    us.ENTRYUUID USERID,\\n\" +\r\n" + 
				"				\"    dbms_lob.substr(\\n\" +\r\n" + 
				"				\"    TEMPLATES,\\n\" +\r\n" + 
				"				\"    36,\\n\" +\r\n" + 
				"				\"    (\\n\" +\r\n" + 
				"				\"    dbms_lob.instr(TEMPLATES, '\"value\":\"')\\n\" +\r\n" + 
				"				\"    ) + length('\"value\":\"')\\n\" +\r\n" + 
				"				\"    ) TEMPLATE_ID\\n\" +\r\n" + 
				"				\"    from\\n\" +\r\n" + 
				"				\"    identitydb.USERS us\\n\" +\r\n" + 
				"				\"    where\\n\" +\r\n" + 
				"				\"    TEMPLATES is not null and instr(USERSETTINGS, 'NATIVE_SIP_CALL_TO_UCM') > 1\\n\" +\r\n" + 
				"				\"    ) Finaluserdata ON Finaluserdata.TEMPLATE_ID = tl.TEMPLATEID\\n\" +\r\n" + 
				"				\"    and Finaluserdata.ORGANIZATIONID = tl.ORGANIZATIONID";
		
		
		String sql1Criteria= null;
		if(true) {
			sql1Criteria = "tl.ORGANIZATIONID in ('b8945078-5936-4d28-8b04-57a0d6e5d8a2','d6b0583c-918a-4543-a9f1-d1aad08be5c6')\n" ;
		}
		else {
			sql1Criteria = null;
		}
		
		
		String sql2Criteria = "ORGANIZATIONID in ('b8945078-5936-4d28-8b04-57a0d6e5d8a2','d6b0583c-918a-4543-a9f1-d1aad08be5c6')\n";
		
		
		
		String mainSQL = SQL3 + " and " + sql1Criteria +
				"    and TEMPLATETYPE = 'jabber'\n" +
				"\n" +
				"union\n" +
				"\n" +
				sql2 + sql2Criteria +
				"Order by\n" +
				"    Organizationid ";
	}
}
