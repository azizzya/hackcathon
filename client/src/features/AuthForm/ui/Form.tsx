import { setUserDataToLocalStorage } from '@/shared/helpers/localStorage.helper';
import { useInput } from '@/shared/helpers/useInput';
import '@/shared/ui/shared.scss';
import { useNavigate } from 'react-router-dom';
import { useLogInMutation } from '../helpers/useLogIn.mutation';
import './styles.scss';

export const AuthForm: React.FC = () => {
	const navigate = useNavigate();

	const loginInput = useInput('');
	const passwordInput = useInput('');

	const loginMutation = useLogInMutation();

	const onSubmitHandler = (e: React.ChangeEvent<HTMLFormElement>) => {
		e.preventDefault();
		loginMutation.mutate({
			username: loginInput.value,
			password: passwordInput.value,
		});
		if (loginMutation.isSuccess) {
			setUserDataToLocalStorage(passwordInput.value, loginInput.value);
			navigate('/main');
		}
	};

	return (
		<form className='auth-form' onSubmit={onSubmitHandler}>
			<div className='auth-form-input-container'>
				<input className='primary-input' placeholder='Логин' {...loginInput} />
				<input
					className='primary-input'
					placeholder='Пароль'
					type='password'
					{...passwordInput}
				/>
			</div>
			<button className='auth-button primary-button'>Авторизоваться</button>
		</form>
	);
};
