import { LIST_USER, DELETE_USER } from './type'
import userService from '../../service/UserService'

export const listUser = () => async (dispatch) => {
    try {
        const resposne = await userService.findAllUser()
        dispatch({
            type: LIST_USER,
            payload: resposne.data
        })
    } catch (error) {
        console.log(error);
    }
}

export const deleteUser = (id) => async (dispatch) => {
    try {
        await userService.remove(id)
        alert('xoá thành công!')
        listUser();
        dispatch({
            type: DELETE_USER,
            payload:id
        })
    } catch (error) {
        console.log(error);
        alert('xoá không thành công!')
    }
}