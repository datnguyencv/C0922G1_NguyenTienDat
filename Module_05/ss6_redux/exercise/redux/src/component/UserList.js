import React from "react";
import { useEffect} from "react";
import {useDispatch, useSelector} from 'react-redux'
import {listUser, deleteUser} from '../redux/actions/action'

function UserList() {
    let users = useSelector(state => state.userState)
    const dispatch = useDispatch();

    useEffect(() => {
        users = dispatch(listUser())
    }, [])

    return (
        <div>
            <h1>User List</h1>
            <button className="btn btn-primary" type="button" data-bs-toggle="collapse"
                    data-bs-target="#collapseExample" aria-expanded="false" aria-controls="collapseExample">
                Get users
            </button>
            <div>
                <div className="collapse" id="collapseExample">
                    <div className="card card-body">
                        <table className="table tableBorder table-striped">
                            <thead>
                            <tr>
                                <th>Id</th>
                                <th>Name</th>
                                <th>Email</th>
                                <th>Website</th>
                                <th>Action</th>
                            </tr>
                            </thead>
                            <tbody>
                            {users.map((user, index) => (
                                <tr key={index}>
                                    <td>{user.id}</td>
                                    <td>{user.username}</td>
                                    <td>{user.email}</td>
                                    <td>{user.website}</td>
                                    <td>
                                        <button className="btn btn-danger" onClick={() =>
                                            dispatch(deleteUser(user.id))}>
                                            Delete
                                        </button>
                                    </td>
                                </tr>
                            ))}
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>
    );
}

export default UserList;
