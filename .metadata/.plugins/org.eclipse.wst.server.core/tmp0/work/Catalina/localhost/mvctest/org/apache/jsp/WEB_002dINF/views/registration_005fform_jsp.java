/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.56
 * Generated at: 2022-01-13 09:47:59 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registration_005fform_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/WEB-INF/lib/spring-webmvc-5.3.10.jar", Long.valueOf(1641363146181L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1641378080484L));
    _jspx_dependants.put("jar:file:/C:/Users/deepak/Desktop/database/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/mvctest/WEB-INF/lib/spring-webmvc-5.3.10.jar!/META-INF/spring-form.tld", Long.valueOf(1631670712000L));
    _jspx_dependants.put("jar:file:/C:/Users/deepak/Desktop/database/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/mvctest/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153365282000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005fform_0026_005fmodelAttribute_005fmethod_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005finput_0026_005fplaceholder_005fpath_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005fpassword_0026_005fplaceholder_005fpath_005fnobody;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fform_005fform_0026_005fmodelAttribute_005fmethod_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005finput_0026_005fplaceholder_005fpath_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005fpassword_0026_005fplaceholder_005fpath_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fform_005fform_0026_005fmodelAttribute_005fmethod_005faction.release();
    _005fjspx_005ftagPool_005fform_005finput_0026_005fplaceholder_005fpath_005fnobody.release();
    _005fjspx_005ftagPool_005fform_005fpassword_0026_005fplaceholder_005fpath_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\r\n");
      out.write("<!-- Bootstrap CSS -->\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\"\r\n");
      out.write("	integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\"\r\n");
      out.write("	crossorigin=\"anonymous\">\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://use.fontawesome.com/releases/v5.6.1/css/all.css\"\r\n");
      out.write("	integrity=\"sha384-gfdkjb5BdAXd+lj+gudLWI+BXq4IuLW5IT+brZEZsLFm++aCMlF1V92rMkPaX4PP\"\r\n");
      out.write("	crossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("body, html {\r\n");
      out.write("	margin: 0;\r\n");
      out.write("	padding: 0;\r\n");
      out.write("	height: 100%;\r\n");
      out.write("	background: #FFFC00 !important;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".user_card {\r\n");
      out.write("	width: 350px;\r\n");
      out.write("	margin-top: auto;\r\n");
      out.write("	margin-bottom: auto;\r\n");
      out.write("	background: #FFFBE4;\r\n");
      out.write("	position: relative;\r\n");
      out.write("	display: flex;\r\n");
      out.write("	justify-content: center;\r\n");
      out.write("	flex-direction: column;\r\n");
      out.write("	padding: 10px;\r\n");
      out.write("	box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0\r\n");
      out.write("		rgba(0, 0, 0, 0.19);\r\n");
      out.write("	-webkit-box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0\r\n");
      out.write("		rgba(0, 0, 0, 0.19);\r\n");
      out.write("	-moz-box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0\r\n");
      out.write("		rgba(0, 0, 0, 0.19);\r\n");
      out.write("	border-radius: 25px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".form_container {\r\n");
      out.write("	margin-top: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#form-title {\r\n");
      out.write("	color: rgb(36, 184, 176);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".login_btn {\r\n");
      out.write("	width: 100%;\r\n");
      out.write("	background: #33ccff !important;\r\n");
      out.write("	color: white !important;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".login_btn:focus {\r\n");
      out.write("	box-shadow: none !important;\r\n");
      out.write("	outline: 0px !important;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".login_container {\r\n");
      out.write("	padding: 0 2rem;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".input-group-text {\r\n");
      out.write("	background: #f7ba5b !important;\r\n");
      out.write("	color: white !important;\r\n");
      out.write("	border: 0 !important;\r\n");
      out.write("	border-radius: 0.25rem 0 0 0.25rem !important;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".input_user, .input_pass:focus {\r\n");
      out.write("	box-shadow: none !important;\r\n");
      out.write("	outline: 0px !important;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<title>Register</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<div class=\"container h-100\">\r\n");
      out.write("		<div class=\"d-flex justify-content-center h-100\">\r\n");
      out.write("			<div class=\"user_card\">\r\n");
      out.write("				<div class=\"d-flex justify-content-center\">\r\n");
      out.write("					<h3 id=\"form-title\">REGISTER ACCOUNT</h3>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"d-flex justify-content-center form_container\">\r\n");
      out.write("\r\n");
      out.write("					");
      if (_jspx_meth_form_005fform_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("				</div>\r\n");
      out.write("\r\n");
      out.write("				<div class=\"mt-4\">\r\n");
      out.write("					<div class=\"d-flex justify-content-center links\">\r\n");
      out.write("						Already have an account? <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/login\" class=\"ml-2\">Login</a>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	<script>\r\n");
      out.write("		/* Because i didnt set placeholder values in forms.py they will be set here using vanilla Javascript\r\n");
      out.write("		//We start indexing at one because CSRF_token is considered and input field\r\n");
      out.write("		 */\r\n");
      out.write("\r\n");
      out.write("		//Query All input fields\r\n");
      out.write("		var form_fields = document.getElementsByTagName('form:input')\r\n");
      out.write("		form_fields[1].placeholder = 'Username..';\r\n");
      out.write("		form_fields[2].placeholder = 'Email..';\r\n");
      out.write("		form_fields[3].placeholder = 'Enter password...';\r\n");
      out.write("		form_fields[4].placeholder = 'Re-enter Password...';\r\n");
      out.write("\r\n");
      out.write("		for ( var field in form_fields) {\r\n");
      out.write("			form_fields[field].className += ' form-control'\r\n");
      out.write("		}\r\n");
      out.write("	</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_form_005fform_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  form:form
    org.springframework.web.servlet.tags.form.FormTag _jspx_th_form_005fform_005f0 = (org.springframework.web.servlet.tags.form.FormTag) _005fjspx_005ftagPool_005fform_005fform_0026_005fmodelAttribute_005fmethod_005faction.get(org.springframework.web.servlet.tags.form.FormTag.class);
    boolean _jspx_th_form_005fform_005f0_reused = false;
    try {
      _jspx_th_form_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_form_005fform_005f0.setParent(null);
      // /WEB-INF/views/registration_form.jsp(97,5) name = method type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005fform_005f0.setMethod("post");
      // /WEB-INF/views/registration_form.jsp(97,5) name = action type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005fform_005f0.setAction((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}/register_user", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      // /WEB-INF/views/registration_form.jsp(97,5) name = modelAttribute type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005fform_005f0.setModelAttribute("user");
      int[] _jspx_push_body_count_form_005fform_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_form_005fform_005f0 = _jspx_th_form_005fform_005f0.doStartTag();
        if (_jspx_eval_form_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("\r\n");
            out.write("						<div class=\"input-group mb-3\">\r\n");
            out.write("							<div class=\"input-group-append\">\r\n");
            out.write("								<span class=\"input-group-text\"><i class=\"fas fa-user\"></i></span>\r\n");
            out.write("							</div>\r\n");
            out.write("							");
            if (_jspx_meth_form_005finput_005f0(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return true;
            out.write("\r\n");
            out.write("						</div>\r\n");
            out.write("						<div class=\"input-group mb-2\">\r\n");
            out.write("							<div class=\"input-group-append\">\r\n");
            out.write("								<span class=\"input-group-text\"><i\r\n");
            out.write("									class=\"fas fa-envelope-square\"></i></span>\r\n");
            out.write("							</div>\r\n");
            out.write("							");
            if (_jspx_meth_form_005finput_005f1(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return true;
            out.write("\r\n");
            out.write("						</div>\r\n");
            out.write("						<div class=\"input-group mb-2\">\r\n");
            out.write("							<div class=\"input-group-append\">\r\n");
            out.write("								<span class=\"input-group-text\"><i class=\"fas fa-key\"></i></span>\r\n");
            out.write("							</div>\r\n");
            out.write("							");
            if (_jspx_meth_form_005fpassword_005f0(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return true;
            out.write("\r\n");
            out.write("						</div>\r\n");
            out.write("						<div class=\"input-group mb-2\">\r\n");
            out.write("							<div class=\"input-group-append\">\r\n");
            out.write("								<span class=\"input-group-text\"><i class=\"fas fa-key\"></i></span>\r\n");
            out.write("							</div>\r\n");
            out.write("							<input type=\"password\" name=\"password2\"\r\n");
            out.write("								placeholder=\"Re-enter password\" />\r\n");
            out.write("						</div>\r\n");
            out.write("\r\n");
            out.write("						<div class=\"d-flex justify-content-center mt-3 login_container\">\r\n");
            out.write("							<input class=\"btn login_btn\" type=\"submit\"\r\n");
            out.write("								value=\"Register Account\">\r\n");
            out.write("						</div>\r\n");
            out.write("					");
            int evalDoAfterBody = _jspx_th_form_005fform_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_form_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_form_005fform_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_form_005fform_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_form_005fform_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fform_005fform_0026_005fmodelAttribute_005fmethod_005faction.reuse(_jspx_th_form_005fform_005f0);
      _jspx_th_form_005fform_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_form_005fform_005f0, _jsp_getInstanceManager(), _jspx_th_form_005fform_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f0 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005fplaceholder_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    boolean _jspx_th_form_005finput_005f0_reused = false;
    try {
      _jspx_th_form_005finput_005f0.setPageContext(_jspx_page_context);
      _jspx_th_form_005finput_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
      // /WEB-INF/views/registration_form.jsp(104,7) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005finput_005f0.setPath("name");
      // /WEB-INF/views/registration_form.jsp(104,7) null
      _jspx_th_form_005finput_005f0.setDynamicAttribute(null, "placeholder", "Enter name....");
      int[] _jspx_push_body_count_form_005finput_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_form_005finput_005f0 = _jspx_th_form_005finput_005f0.doStartTag();
        if (_jspx_th_form_005finput_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_form_005finput_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_form_005finput_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_form_005finput_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fform_005finput_0026_005fplaceholder_005fpath_005fnobody.reuse(_jspx_th_form_005finput_005f0);
      _jspx_th_form_005finput_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_form_005finput_005f0, _jsp_getInstanceManager(), _jspx_th_form_005finput_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f1 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005fplaceholder_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    boolean _jspx_th_form_005finput_005f1_reused = false;
    try {
      _jspx_th_form_005finput_005f1.setPageContext(_jspx_page_context);
      _jspx_th_form_005finput_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
      // /WEB-INF/views/registration_form.jsp(111,7) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005finput_005f1.setPath("email");
      // /WEB-INF/views/registration_form.jsp(111,7) null
      _jspx_th_form_005finput_005f1.setDynamicAttribute(null, "placeholder", "Email....");
      int[] _jspx_push_body_count_form_005finput_005f1 = new int[] { 0 };
      try {
        int _jspx_eval_form_005finput_005f1 = _jspx_th_form_005finput_005f1.doStartTag();
        if (_jspx_th_form_005finput_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_form_005finput_005f1[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_form_005finput_005f1.doCatch(_jspx_exception);
      } finally {
        _jspx_th_form_005finput_005f1.doFinally();
      }
      _005fjspx_005ftagPool_005fform_005finput_0026_005fplaceholder_005fpath_005fnobody.reuse(_jspx_th_form_005finput_005f1);
      _jspx_th_form_005finput_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_form_005finput_005f1, _jsp_getInstanceManager(), _jspx_th_form_005finput_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_form_005fpassword_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  form:password
    org.springframework.web.servlet.tags.form.PasswordInputTag _jspx_th_form_005fpassword_005f0 = (org.springframework.web.servlet.tags.form.PasswordInputTag) _005fjspx_005ftagPool_005fform_005fpassword_0026_005fplaceholder_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.PasswordInputTag.class);
    boolean _jspx_th_form_005fpassword_005f0_reused = false;
    try {
      _jspx_th_form_005fpassword_005f0.setPageContext(_jspx_page_context);
      _jspx_th_form_005fpassword_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
      // /WEB-INF/views/registration_form.jsp(117,7) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005fpassword_005f0.setPath("password");
      // /WEB-INF/views/registration_form.jsp(117,7) null
      _jspx_th_form_005fpassword_005f0.setDynamicAttribute(null, "placeholder", "Password..");
      int[] _jspx_push_body_count_form_005fpassword_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_form_005fpassword_005f0 = _jspx_th_form_005fpassword_005f0.doStartTag();
        if (_jspx_th_form_005fpassword_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_form_005fpassword_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_form_005fpassword_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_form_005fpassword_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fform_005fpassword_0026_005fplaceholder_005fpath_005fnobody.reuse(_jspx_th_form_005fpassword_005f0);
      _jspx_th_form_005fpassword_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_form_005fpassword_005f0, _jsp_getInstanceManager(), _jspx_th_form_005fpassword_005f0_reused);
    }
    return false;
  }
}