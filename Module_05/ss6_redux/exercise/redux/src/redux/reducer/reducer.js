import { LIST_USER, DELETE_USER } from "../actions/type";

const initState = [];
export const userReducer = (states = initState, action) => {
      const {type,payload} = action;
    switch (type) {
        case LIST_USER:
            return payload
        case DELETE_USER:
            return states.filter((state)=>(state.id!==payload))
        default:
            return states;
    }
};