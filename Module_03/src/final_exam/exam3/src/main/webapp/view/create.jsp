<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
  <title>Create student</title>
  <link rel="stylesheet" href="../MDB5-STANDARD-UI-KIT-Free-6.0.1/css/mdb.min.css">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"
          integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN"
          crossorigin="anonymous"></script>
</head>
<body>
<center>
  <button type="button" class="btn btn-info"><a style="text-decoration: none" href="view">
    Home</a></button>
  <h1>
    Create food
    <div>
      <span style="color: darkcyan;font-size: 50%">   </span>
    </div>
  </h1>
  <form action="view"?action=create" method="post">
    <div class="mb-3">
      <label for="exampleInputEmail" class="form-label">Code Food</label>
      <input type="text" class="form-control" id="exampleInputEmail" aria-describedby="emailHelp"
              name="name" required
              title="Nhap chưa đúng định dạng">
    </div>
    <div class="mb-3">
      <label for="exampleInputEmail1" class="form-label">Name Food</label>
      <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp"
              name="name"
             title="Nhap chưa đúng định dạng" required>
    </div>
    <div class="mb-3">
      <label for="exampleInputEmail2" class="form-label">Start Date</label>
      <input type="text" class="form-control" id="exampleInputEmail2" aria-describedby="emailHelp"
             name="startdate" required>
    </div>
    <div class="mb-3">
      <label for="exampleInputEmail3" class="form-label">End Date</label>
      <input type="text" class="form-control" id="exampleInputEmail3" aria-describedby="emailHelp"
             name="enddate" required>
    </div>
    <div class="mb-3">
      <label class="form-label">Food Type</label>
      <select class="nav-item dropdown" name="type" id>
        <c:forEach  items="${foodList.id}>${foodList.name}" var="classes">
          <option value="${foodList.name}"></option>
        </c:forEach>
      </select>
    </div>
    <div class="modal-footer">
      <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Cancel</button>
      <button type="submit" class="btn btn-primary">Save student</button>
    </div>
  </form>
</center>

</body>
<script src="../bootstrap-5.3.0-alpha1-dist/bootstrap-5.3.0-alpha1-dist/js/bootstrap.js"></script>
<script src="../MDB5-STANDARD-UI-KIT-Free-6.0.1/js/mdb.min.js"></script>
</html>