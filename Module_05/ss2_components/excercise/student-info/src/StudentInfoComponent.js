import React from "react";

const students = [
  { id: 1, name: "Tiến Đạt", age: 20, address: "Đà Nẵng" },
  { id: 2, name: "Minh Thông", age: 22, address: "Quảng Nam" },
  { id: 3, name: "Văn Trí", age: 21, address: "Quảng Trị" },
];
export class StudentInfoComponent extends React.Component {
  
  render() {
    // Dữ liệu danh sách sinh viên
  
    return (
      <div id="student-list">
        <div className="table-responsive">
          <table className="table table-primary">
            <thead>
              <tr>
                <th scope="col">ID</th>
                <th scope="col">Name</th>
                <th scope="col">Age</th>
                <th scope="col">Address</th>
              </tr>
            </thead>
            <tbody>
              {students.map((student) => (
                <tr key={student.id}>
                  <td>{student.id}</td>
                  <td>{student.name}</td>
                  <td>{student.age}</td>
                  <td>{student.address}</td>
                </tr>
              ))}
            </tbody>
          </table>
        </div>
      </div>
    );
  }
}
