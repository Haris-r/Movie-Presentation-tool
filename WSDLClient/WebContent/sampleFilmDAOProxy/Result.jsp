<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleFilmDAOProxyid" scope="session" class="model.FilmDAOProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleFilmDAOProxyid.setEndpoint(request.getParameter("endpoint"));
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
        java.lang.String getEndpoint2mtemp = sampleFilmDAOProxyid.getEndpoint();
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
        sampleFilmDAOProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        model.FilmDAO getFilmDAO10mtemp = sampleFilmDAOProxyid.getFilmDAO();
if(getFilmDAO10mtemp == null){
%>
<%=getFilmDAO10mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
</TABLE>
<%
}
break;
case 15:
        gotMethod = true;
        model.Film[] getAllFilms15mtemp = sampleFilmDAOProxyid.getAllFilms();
if(getAllFilms15mtemp == null){
%>
<%=getAllFilms15mtemp %>
<%
}else{
        String tempreturnp16 = null;
        if(getAllFilms15mtemp != null){
        java.util.List listreturnp16= java.util.Arrays.asList(getAllFilms15mtemp);
        tempreturnp16 = listreturnp16.toString();
        }
        %>
        <%=tempreturnp16%>
        <%
}
break;
case 18:
        gotMethod = true;
        String id_1id=  request.getParameter("id33");
        int id_1idTemp  = Integer.parseInt(id_1id);
        model.Film getFilmByID18mtemp = sampleFilmDAOProxyid.getFilmByID(id_1idTemp);
if(getFilmByID18mtemp == null){
%>
<%=getFilmByID18mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">stars:</TD>
<TD>
<%
if(getFilmByID18mtemp != null){
java.lang.String typestars21 = getFilmByID18mtemp.getStars();
        String tempResultstars21 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typestars21));
        %>
        <%= tempResultstars21 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">review:</TD>
<TD>
<%
if(getFilmByID18mtemp != null){
java.lang.String typereview23 = getFilmByID18mtemp.getReview();
        String tempResultreview23 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typereview23));
        %>
        <%= tempResultreview23 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">director:</TD>
<TD>
<%
if(getFilmByID18mtemp != null){
java.lang.String typedirector25 = getFilmByID18mtemp.getDirector();
        String tempResultdirector25 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typedirector25));
        %>
        <%= tempResultdirector25 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">year:</TD>
<TD>
<%
if(getFilmByID18mtemp != null){
%>
<%=getFilmByID18mtemp.getYear()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">title:</TD>
<TD>
<%
if(getFilmByID18mtemp != null){
java.lang.String typetitle29 = getFilmByID18mtemp.getTitle();
        String tempResulttitle29 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typetitle29));
        %>
        <%= tempResulttitle29 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">id:</TD>
<TD>
<%
if(getFilmByID18mtemp != null){
%>
<%=getFilmByID18mtemp.getId()
%><%}%>
</TD>
</TABLE>
<%
}
break;
case 35:
        gotMethod = true;
        String name_2id=  request.getParameter("name50");
            java.lang.String name_2idTemp = null;
        if(!name_2id.equals("")){
         name_2idTemp  = name_2id;
        }
        model.Film getFilmByName35mtemp = sampleFilmDAOProxyid.getFilmByName(name_2idTemp);
if(getFilmByName35mtemp == null){
%>
<%=getFilmByName35mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">stars:</TD>
<TD>
<%
if(getFilmByName35mtemp != null){
java.lang.String typestars38 = getFilmByName35mtemp.getStars();
        String tempResultstars38 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typestars38));
        %>
        <%= tempResultstars38 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">review:</TD>
<TD>
<%
if(getFilmByName35mtemp != null){
java.lang.String typereview40 = getFilmByName35mtemp.getReview();
        String tempResultreview40 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typereview40));
        %>
        <%= tempResultreview40 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">director:</TD>
<TD>
<%
if(getFilmByName35mtemp != null){
java.lang.String typedirector42 = getFilmByName35mtemp.getDirector();
        String tempResultdirector42 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typedirector42));
        %>
        <%= tempResultdirector42 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">year:</TD>
<TD>
<%
if(getFilmByName35mtemp != null){
%>
<%=getFilmByName35mtemp.getYear()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">title:</TD>
<TD>
<%
if(getFilmByName35mtemp != null){
java.lang.String typetitle46 = getFilmByName35mtemp.getTitle();
        String tempResulttitle46 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typetitle46));
        %>
        <%= tempResulttitle46 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">id:</TD>
<TD>
<%
if(getFilmByName35mtemp != null){
%>
<%=getFilmByName35mtemp.getId()
%><%}%>
</TD>
</TABLE>
<%
}
break;
case 52:
        gotMethod = true;
        String id_3id=  request.getParameter("id67");
        int id_3idTemp  = Integer.parseInt(id_3id);
        String title_4id=  request.getParameter("title69");
            java.lang.String title_4idTemp = null;
        if(!title_4id.equals("")){
         title_4idTemp  = title_4id;
        }
        String year_5id=  request.getParameter("year71");
        int year_5idTemp  = Integer.parseInt(year_5id);
        String director_6id=  request.getParameter("director73");
            java.lang.String director_6idTemp = null;
        if(!director_6id.equals("")){
         director_6idTemp  = director_6id;
        }
        String stars_7id=  request.getParameter("stars75");
            java.lang.String stars_7idTemp = null;
        if(!stars_7id.equals("")){
         stars_7idTemp  = stars_7id;
        }
        String review_8id=  request.getParameter("review77");
            java.lang.String review_8idTemp = null;
        if(!review_8id.equals("")){
         review_8idTemp  = review_8id;
        }
        model.Film postCreateFilm52mtemp = sampleFilmDAOProxyid.postCreateFilm(id_3idTemp,title_4idTemp,year_5idTemp,director_6idTemp,stars_7idTemp,review_8idTemp);
if(postCreateFilm52mtemp == null){
%>
<%=postCreateFilm52mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">stars:</TD>
<TD>
<%
if(postCreateFilm52mtemp != null){
java.lang.String typestars55 = postCreateFilm52mtemp.getStars();
        String tempResultstars55 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typestars55));
        %>
        <%= tempResultstars55 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">review:</TD>
<TD>
<%
if(postCreateFilm52mtemp != null){
java.lang.String typereview57 = postCreateFilm52mtemp.getReview();
        String tempResultreview57 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typereview57));
        %>
        <%= tempResultreview57 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">director:</TD>
<TD>
<%
if(postCreateFilm52mtemp != null){
java.lang.String typedirector59 = postCreateFilm52mtemp.getDirector();
        String tempResultdirector59 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typedirector59));
        %>
        <%= tempResultdirector59 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">year:</TD>
<TD>
<%
if(postCreateFilm52mtemp != null){
%>
<%=postCreateFilm52mtemp.getYear()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">title:</TD>
<TD>
<%
if(postCreateFilm52mtemp != null){
java.lang.String typetitle63 = postCreateFilm52mtemp.getTitle();
        String tempResulttitle63 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typetitle63));
        %>
        <%= tempResulttitle63 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">id:</TD>
<TD>
<%
if(postCreateFilm52mtemp != null){
%>
<%=postCreateFilm52mtemp.getId()
%><%}%>
</TD>
</TABLE>
<%
}
break;
case 79:
        gotMethod = true;
        String id_9id=  request.getParameter("id94");
        int id_9idTemp  = Integer.parseInt(id_9id);
        model.Film deleteFilmById79mtemp = sampleFilmDAOProxyid.deleteFilmById(id_9idTemp);
if(deleteFilmById79mtemp == null){
%>
<%=deleteFilmById79mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">stars:</TD>
<TD>
<%
if(deleteFilmById79mtemp != null){
java.lang.String typestars82 = deleteFilmById79mtemp.getStars();
        String tempResultstars82 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typestars82));
        %>
        <%= tempResultstars82 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">review:</TD>
<TD>
<%
if(deleteFilmById79mtemp != null){
java.lang.String typereview84 = deleteFilmById79mtemp.getReview();
        String tempResultreview84 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typereview84));
        %>
        <%= tempResultreview84 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">director:</TD>
<TD>
<%
if(deleteFilmById79mtemp != null){
java.lang.String typedirector86 = deleteFilmById79mtemp.getDirector();
        String tempResultdirector86 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typedirector86));
        %>
        <%= tempResultdirector86 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">year:</TD>
<TD>
<%
if(deleteFilmById79mtemp != null){
%>
<%=deleteFilmById79mtemp.getYear()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">title:</TD>
<TD>
<%
if(deleteFilmById79mtemp != null){
java.lang.String typetitle90 = deleteFilmById79mtemp.getTitle();
        String tempResulttitle90 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typetitle90));
        %>
        <%= tempResulttitle90 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">id:</TD>
<TD>
<%
if(deleteFilmById79mtemp != null){
%>
<%=deleteFilmById79mtemp.getId()
%><%}%>
</TD>
</TABLE>
<%
}
break;
case 96:
        gotMethod = true;
        String id_10id=  request.getParameter("id111");
        int id_10idTemp  = Integer.parseInt(id_10id);
        String title_11id=  request.getParameter("title113");
            java.lang.String title_11idTemp = null;
        if(!title_11id.equals("")){
         title_11idTemp  = title_11id;
        }
        String year_12id=  request.getParameter("year115");
        int year_12idTemp  = Integer.parseInt(year_12id);
        String director_13id=  request.getParameter("director117");
            java.lang.String director_13idTemp = null;
        if(!director_13id.equals("")){
         director_13idTemp  = director_13id;
        }
        String stars_14id=  request.getParameter("stars119");
            java.lang.String stars_14idTemp = null;
        if(!stars_14id.equals("")){
         stars_14idTemp  = stars_14id;
        }
        String review_15id=  request.getParameter("review121");
            java.lang.String review_15idTemp = null;
        if(!review_15id.equals("")){
         review_15idTemp  = review_15id;
        }
        model.Film updateFilm96mtemp = sampleFilmDAOProxyid.updateFilm(id_10idTemp,title_11idTemp,year_12idTemp,director_13idTemp,stars_14idTemp,review_15idTemp);
if(updateFilm96mtemp == null){
%>
<%=updateFilm96mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">stars:</TD>
<TD>
<%
if(updateFilm96mtemp != null){
java.lang.String typestars99 = updateFilm96mtemp.getStars();
        String tempResultstars99 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typestars99));
        %>
        <%= tempResultstars99 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">review:</TD>
<TD>
<%
if(updateFilm96mtemp != null){
java.lang.String typereview101 = updateFilm96mtemp.getReview();
        String tempResultreview101 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typereview101));
        %>
        <%= tempResultreview101 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">director:</TD>
<TD>
<%
if(updateFilm96mtemp != null){
java.lang.String typedirector103 = updateFilm96mtemp.getDirector();
        String tempResultdirector103 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typedirector103));
        %>
        <%= tempResultdirector103 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">year:</TD>
<TD>
<%
if(updateFilm96mtemp != null){
%>
<%=updateFilm96mtemp.getYear()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">title:</TD>
<TD>
<%
if(updateFilm96mtemp != null){
java.lang.String typetitle107 = updateFilm96mtemp.getTitle();
        String tempResulttitle107 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typetitle107));
        %>
        <%= tempResulttitle107 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">id:</TD>
<TD>
<%
if(updateFilm96mtemp != null){
%>
<%=updateFilm96mtemp.getId()
%><%}%>
</TD>
</TABLE>
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