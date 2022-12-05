<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleEnquiryServiceProxyProxyid" scope="session" class="com.axis.EnquiryServiceProxyProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleEnquiryServiceProxyProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleEnquiryServiceProxyProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleEnquiryServiceProxyProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        com.axis.EnquiryServiceProxy getEnquiryServiceProxy10mtemp = sampleEnquiryServiceProxyProxyid.getEnquiryServiceProxy();
if(getEnquiryServiceProxy10mtemp == null){
%>
<%=getEnquiryServiceProxy10mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">endpoint:</TD>
<TD>
<%
if(getEnquiryServiceProxy10mtemp != null){
java.lang.String typeendpoint15 = getEnquiryServiceProxy10mtemp.getEndpoint();
        String tempResultendpoint15 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeendpoint15));
        %>
        <%= tempResultendpoint15 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 17:
        gotMethod = true;
        String flightNum_1id=  request.getParameter("flightNum20");
        int flightNum_1idTemp  = Integer.parseInt(flightNum_1id);
        String seatNum_2id=  request.getParameter("seatNum22");
        int seatNum_2idTemp  = Integer.parseInt(seatNum_2id);
        java.lang.String getName17mtemp = sampleEnquiryServiceProxyProxyid.getName(flightNum_1idTemp,seatNum_2idTemp);
if(getName17mtemp == null){
%>
<%=getName17mtemp %>
<%
}else{
        String tempResultreturnp18 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getName17mtemp));
        %>
        <%= tempResultreturnp18 %>
        <%
}
break;
case 24:
        gotMethod = true;
        String from_3id=  request.getParameter("from27");
            java.lang.String from_3idTemp = null;
        if(!from_3id.equals("")){
         from_3idTemp  = from_3id;
        }
        String to_4id=  request.getParameter("to29");
            java.lang.String to_4idTemp = null;
        if(!to_4id.equals("")){
         to_4idTemp  = to_4id;
        }
        java.lang.String getDetails24mtemp = sampleEnquiryServiceProxyProxyid.getDetails(from_3idTemp,to_4idTemp);
if(getDetails24mtemp == null){
%>
<%=getDetails24mtemp %>
<%
}else{
        String tempResultreturnp25 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getDetails24mtemp));
        %>
        <%= tempResultreturnp25 %>
        <%
}
break;
case 31:
        gotMethod = true;
        String endpoint_5id=  request.getParameter("endpoint34");
            java.lang.String endpoint_5idTemp = null;
        if(!endpoint_5id.equals("")){
         endpoint_5idTemp  = endpoint_5id;
        }
        sampleEnquiryServiceProxyProxyid.setEndpoint(endpoint_5idTemp);
break;
case 36:
        gotMethod = true;
        java.lang.String getEndpoint36mtemp = sampleEnquiryServiceProxyProxyid.getEndpoint();
if(getEndpoint36mtemp == null){
%>
<%=getEndpoint36mtemp %>
<%
}else{
        String tempResultreturnp37 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint36mtemp));
        %>
        <%= tempResultreturnp37 %>
        <%
}
break;
case 39:
        gotMethod = true;
        java.lang.Object getEnquiryService39mtemp = sampleEnquiryServiceProxyProxyid.getEnquiryService();
if(getEnquiryService39mtemp == null){
%>
<%=getEnquiryService39mtemp %>
<%
}else{
        String tempResultreturnp40 = org.eclipse.jst.ws.util.JspUtils.markup(getEnquiryService39mtemp.toString());
        %>
        <%= tempResultreturnp40 %>
        <%
}
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>