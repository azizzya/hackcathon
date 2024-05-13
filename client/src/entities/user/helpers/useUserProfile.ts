import { userService } from '@/shared/api/user.service';
import { useQuery } from '@tanstack/react-query';

export function useUserProfile() {
	return useQuery({
		queryKey: ['user', 'profile'],
		queryFn: () => userService.getProfile(),
		select: ({ data }) => data,
	});
}
