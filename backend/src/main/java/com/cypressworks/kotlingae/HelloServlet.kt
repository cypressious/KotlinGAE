package com.cypressworks.kotlingae

import javax.servlet.http.HttpServlet
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

public class HelloServlet : HttpServlet() {

    override fun doGet(req: HttpServletRequest, resp: HttpServletResponse) {
        resp.writer.print("Hello")
    }


    override fun doPost(req: HttpServletRequest, resp: HttpServletResponse) = doGet(req, resp)
}
