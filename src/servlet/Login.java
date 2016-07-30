package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import example.Era;
import example.EraLogic;

public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		int ini = Integer.parseInt(request.getParameter("ini"));
		int runs = Integer.parseInt(request.getParameter("runs"));

		Era era = new Era();
		era.setInning(ini);
		era.setRunsAllowd(runs);

		EraLogic eraLogic = new EraLogic();

		boolean isLogin = eraLogic.check(era);
		if (isLogin) {
			era.setEra(eraLogic.cul(era));
			HttpSession session = request.getSession();
			session.setAttribute("result", era);

		}

		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/loginResult.jsp");
		dispatcher.forward(request, response);

	}

}
