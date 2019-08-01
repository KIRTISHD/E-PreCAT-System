import { Role } from './Role';
import { Response } from './Response';

export interface IUser {
    uid?:number;
    username:string;
    password:string;
    role: Role;
    response?: Response; 
}