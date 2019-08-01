import { Role } from './Role';
import { Response } from './Response';
import {IUser} from './IUser';

export class User implements IUser{
    uid?: number;    username: string;
    password: string;
    role: Role;
    response?: Response;
  

   
}