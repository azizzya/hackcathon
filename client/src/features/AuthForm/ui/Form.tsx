import { useInput } from '@/shared/helpers/useInput';
import '@/shared/ui/shared.scss';
import { useLogInMutation } from '../helpers/useLogIn.mutation';
import './styles.scss';

export const AuthForm: React.FC = () => {
	const loginInput = useInput('');
	const passwordInput = useInput('');
	const loginMutation = useLogInMutation();
	const onSubmitHandler = (e: React.ChangeEvent<HTMLFormElement>) => {
		e.preventDefault();
		loginMutation.mutate({
			login: loginInput.value,
			password: passwordInput.value,
		});
	};

	return (
		<form className='auth-form' onSubmit={onSubmitHandler}>
			<input className='primary-input' placeholder='login' {...loginInput} />
			<input
				className='primary-input'
				placeholder='password'
				type='password'
				{...passwordInput}
			/>
			<button className='primary-button'>Авторизоваться</button>
		</form>
	);
};
