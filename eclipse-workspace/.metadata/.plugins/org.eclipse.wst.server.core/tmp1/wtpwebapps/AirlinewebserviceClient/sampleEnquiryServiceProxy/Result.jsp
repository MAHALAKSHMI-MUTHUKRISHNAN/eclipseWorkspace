<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleEnquiryServiceProxyid" scope="session" class="com.axis.EnquiryServiceProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleEnquiryServiceProxyid.setEndpoint(request.getParameter("endpoint"));
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
        java.lang.String getEndpoint2mtemp = sampleEnquiryServiceProxyid.getEndpoint();
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
        sampleEnquiryServiceProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        com.axis.EnquiryService getEnquiryService10mtemp = sampleEnquiryServiceProxyid.getEnquiryService();
if(getEnquiryService10mtemp == null){
%>
<%=getEnquiryService10mtemp %>
<%
}else{
        if(getEnquiryService10mtemp!= null){
        String tempreturnp11 = getEnquiryService10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String flightNum_1id=  request.getParameter("flightNum16");
        int flightNum_1idTemp  = Integer.parseInt(flightNum_1id);
        String seatNum_2id=  request.getParameter("seatNum18");
        int seatNum_2idTemp  = Integer.parseInt(seatNum_2id);
        java.lang.String getName13mtemp = sampleEnquiryServiceProxyid.getName(flightNum_1idTemp,seatNum_2idTemp);
if(getName13mtemp == null){
%>
<%=getName13mtemp %>
<%
}else{
        String tempResultreturnp14 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getName13mtemp));
        %>
        <%= tempResultreturnp14 %>
        <%
}
break;
case 20:
        gotMethod = true;
        String from_3id=  request.getParameter("from23");
            java.lang.String from_3idTemp = null;
        if(!from_3id.equals("")){
         from_3idTemp  = from_3id;
        }
        String to_4id=  request.getParameter("to25");
            java.lang.String to_4idTemp = null;
        if(!to_4id.equals("")){
         to_4idTemp  = to_4id;
        }
        java.lang.String getDetails20mtemp = sampleEnquiryServiceProxyid.getDetails(from_3idTemp,to_4idTemp);
if(getDetails20mtemp == null){
%>
<%=getDetails20mtemp %>
<%
}else{
        String tempResultreturnp21 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getDetails20mtemp));
        %>
        <%= tempResultreturnp21 %>
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