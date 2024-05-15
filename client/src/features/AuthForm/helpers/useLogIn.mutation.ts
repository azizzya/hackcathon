import { authService } from '@/shared/api/auth.service';
import { IUserLogIn } from '@/shared/interfaces/user.interfaces';
import { useMutation } from '@tanstack/react-query';

export function useLogInMutation() {
	return useMutation({
		mutationFn: (user: IUserLogIn) => authService.auth(user),
		mutationKey: ['auth'],
		onSuccess: () => {},
	});
}
