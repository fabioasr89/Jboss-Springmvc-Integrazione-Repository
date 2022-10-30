<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles-extras" prefix="tilesx" %>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>

<c:if test="${sessionScope.logged==false}">
	<div class="card">
  <div class="card-body">
  	<form action="/login" method="get">
  		<button class="btn btb-primary" >Vai al Login</button>
  	</form>
  </div>
  </div>
</c:if>