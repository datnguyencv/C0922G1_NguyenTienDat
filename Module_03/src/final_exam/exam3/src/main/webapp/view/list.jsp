<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List Food</title>
    <link rel="stylesheet" href="../MDB5-STANDARD-UI-KIT-Free-6.0.1/css/mdb.min.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN"
            crossorigin="anonymous"></script>
    <%--    Phân trang--%>
    <link rel="stylesheet" href="library/bootstrap520/css/bootstrap.min.css">
    <link rel="stylesheet" href="library/datatables/css/dataTables.bootstrap5.min.css">
</head>
<body>
<center>
    <button type="button" class="btn btn-info"><a style="text-decoration: none" href="view?action=create">
        Add new Food</a></button>
    <h1>
        List Food
        <div>
            <span style="color: darkcyan;font-size: 50%">m</span>
        </div>
    </h1>
    <table id="tableStudent" class="table table-striped">
        <thead>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Start Date</th>
            <th>End Date</th>
            <th>Food Type</th>
            <th>Description</th>
            <th>Edit</th>
            <th>Delete</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${foodList}" var="foods" >
            <tr>
                <td>${foods.code_id}</td>
                <td>${foods.name}</td>
                <td>${foods.start_date}</td>
                <td>${foods.end_date}</td>
                <td>${foods.description}</td>
                <td>
                    <button type="button" class="btn btn-warning" data-bs-toggle="modal"
                            data-bs-target="#exampleModal12"><a href="view?action=edit&idEdit1="
                                                                style="text-decoration: none">
                        Edit
                    </a>
                    </button>
                </td>
                <td>
                    <button onclick="infoDelete()"
                            type="button" class="btn btn-danger" data-bs-toggle="modal"
                            data-bs-target="#exampleModal3">
                        Delete
                    </button>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</center>
<%--Modal create--%>
<div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h1 class="modal-title fs-5" id="exampleModalLabel1">Create student</h1>
                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
            </div>
            <div class="modal-body">
                <form action="view?action=create" method="post">
                    <div class="mb-3">
                        <label for="exampleInputEmail" class="form-label">Full name</label>
                        <input type="text" class="form-control" id="exampleInputEmail" aria-describedby="emailHelp"
                               placeholder="VD: Nguyễn Văn An" name="name" required
                               pattern="^[A-Z][a-z]*(\s[A-Z][a-z]*)*$" title="Tên phải viết hoa chữ cái đầu">
                    </div>
                    <div class="mb-3">
                        <label for="exampleInputEmail1" class="form-label">Email</label>
                        <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp"
                               placeholder="VD:an@gmail.com" name="email"
                        pattern="^\p{Lu}\p{Ll}+(\s\p{Lu}\p{Ll}+)*|(?=.{1,64}@)[A-Za-z0-9_-]+(\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\.[A-Za-z0-9-]+)*(\.[A-Za-z]{2,})$"
                        title="Email chưa đúng định dạng" required>
                    </div>
                    <div class="mb-3">
                        <label for="exampleInputEmail2" class="form-label">Phone number</label>
                        <input type="text" class="form-control" id="exampleInputEmail2" aria-describedby="emailHelp"
                               placeholder="VD: Nguyễn Văn An" name="phoneNumber" required>
                    </div>
                    <div class="mb-3">
                        <label for="exampleInputEmail3" class="form-label">Point</label>
                        <input type="text" class="form-control" id="exampleInputEmail3" aria-describedby="emailHelp"
                               placeholder="VD: 10" name="point" required>
                    </div>
                    <div class="mb-3">
                        <label class="form-label">Class</label>
                        <select class="nav-item dropdown" name="classId" id>
                            <  items=" " var="classes">
                                <option value= </option>
                            <
                        </select>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Cancel</button>
                        <button type="submit" class="btn btn-primary">Save student</button>
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>

<!-- Modal delete-->
<div class="modal fade" id="exampleModal3" tabindex="-1" aria-labelledby="exampleModalLabel3" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h1 class="modal-title fs-5" id="exampleModalLabel3">Delete customer</h1>
                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
            </div>
            <div class="modal-body">
                <form action="view?action=delete" method="post">
                    <input hidden id="idDelete" name="idDelete">
                    <span>
                        Bạn có chắc chắn muốn xóa <span style="color: red" id="nameDelete"></span>
                    </span>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Cancel</button>
                        <button type="submit" class="btn btn-primary">Delete</button>
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>
</body>
<script src="../bootstrap-5.3.0-alpha1-dist/bootstrap-5.3.0-alpha1-dist/js/bootstrap.js"></script>
<script src="../MDB5-STANDARD-UI-KIT-Free-6.0.1/js/mdb.min.js"></script>
<%--Phân trang--%>
<script src="library/jquery/jquery-3.5.1.min.js"></script>
<script src="library/datatables/js/jquery.dataTables.min.js"></script>
<script src="library/datatables/js/dataTables.bootstrap5.min.js"></script>
<script>
    $(document).ready(function () {
        $('#tableStudent').dataTable({
                "dom": 'lrtip',
                "lengthChange": false,
                "pageLength": 6
            }
        )
    })
</script>
<script>
    function infoStudent(id, name, email, phoneNumber, point){
        document.getElementById("idEdit").value = id;
        document.getElementById("nameEdit").value = name;
        document.getElementById("emailEdit").value = email;
        document.getElementById("phoneNumberEdit").value = phoneNumber;
        document.getElementById("pointEdit").value = point;
    }

    function infoDelete(id, name) {
        document.getElementById("idDelete").value = id;
        document.getElementById("nameDelete").innerHTML = name;
    }
</script>
</html>
